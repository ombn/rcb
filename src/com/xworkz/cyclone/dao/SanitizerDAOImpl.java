package com.xworkz.cyclone.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.cyclone.dto.SanitizerDTO;
import com.xworkz.cyclone.singleton.SFUtil;

public class SanitizerDAOImpl implements SanitizerDAO {

	private SessionFactory factory = SFUtil.getFactory();

	@Override
	public SanitizerDTO fetchByBrandName(String name) {

		Session session = this.factory.openSession();
		try {
			System.out.println("START : fetchByBrandName " + name);
			// STEP 1 , CREATE
			String hql = "SELECT SAN FROM SanitizerDTO SAN WHERE brandName='" + name + "'";
			Query query = session.createQuery(hql);
			// STEP 2 , PROCESS
			Object result = query.uniqueResult();
			SanitizerDTO entity = (SanitizerDTO) result;
			return entity;

		} catch (HibernateException e) {
			System.err.println("$$$$$$$$$$$$ Exception in fetchByBrandName" + e.getMessage() + e);
		} finally {
			session.close();
		}
		System.out.println("END : fetchByBrandName " + name);
		return null;
	}

	@Override
	public SanitizerDTO fetchByBrandNameAndQuantity(String name, Double quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String fetchBrandNameByIDAndQuantity(int id, Double quantity) {

		Session session = factory.openSession();
		try {
			// STEP 1 create
			String hqlSyntax = "select san.brandName from  SanitizerDTO san where san.sid=" + id + " and san.quantity="
					+ quantity + "";
			Query query = session.createQuery(hqlSyntax);
			System.out.println("QQQQQQQQQQQQQ" + query);
			Object object = query.uniqueResult();
			String brand = (String) object;
			return brand;

		} catch (Exception e) {
			System.err.println("Exception in dao fetchBrandNameByIDAndQuantity" + e.getMessage());
		} finally {
			session.close();
		}

		return null;
	}

	@Override
	public Integer fetchIdByQuantityAndBrandName(String brandName, Double quantity) {

		Session session = factory.openSession();
		try {
			// STEP 1 Create
			Query query = session.getNamedQuery("fetchIdByQuantityAndBrandName");
			query.setParameter("bname", brandName);
			query.setParameter("qty", quantity);

			System.out.println("QQQQQQQQQQQQQQQQQQQQQQ" + query);
			// STEP 2 Process
			Object obj = query.uniqueResult();
			Integer id = (Integer) obj;
			return id;
		} catch (Exception e) {
			System.err.println("Exception in dao fetchIdByQuantityAndBrandName" + e.getMessage());
		} finally {
			session.close();
		}

		return null;
	}

	@Override
	public SanitizerDTO fetchByBrandNameAndMfgDate(String bname, String mfgDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long fetchCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long fetchCountByPrice(Double price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double fetchMaxByPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double fetchSumByPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double fetchSecondMaxByPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override // Top ten vulnerability in Web applications = Hp Fortify
	public Object fetchBrandNameAndPriceById(int id) {
		Session session = this.factory.openSession();
		try {
			Query query = session.getNamedQuery("fetchBrandNameAndPriceById");
			query.setParameter("sanid", id);

			System.out.println("QQQQQQQQQQQQQ" + query);
			Object obj = query.uniqueResult();
			Object[] array = (Object[]) obj;
			System.out.println(array.length);
			System.out.println(array[0]);
			System.out.println(array[1]);
			System.out.println(obj);
			return obj;

		} catch (HibernateException he) {
			System.err.println("HibernateException in fetchBrandNameAndPriceById ," + he.getMessage());
		} finally {
			session.close();
		}
		return null;
	}

	@Override
	public List<SanitizerDTO> fetchAll() {

		Session session = this.factory.openSession();
		try {
			// STEP 1 Create
			Query query = session.getNamedQuery("fetchAll");
			System.out.println("QQQQQQQQQQQQQQQQQQQQ" + query);
			// STEP 2 , PROCESS
			List<SanitizerDTO> list = query.list();

			return list;

		} catch (HibernateException he) {
			System.err.println("HibernateException in fetchAll ," + he.getMessage());
		} finally {
			session.close();
		}
		return null;
	}

	@Override
	public List<String> fetchAllBrandName() {

		Session session = this.factory.openSession();
		try {
			// STEP 1 Create
			Query query = session.getNamedQuery("fetchAllBrandName");
			System.out.println("QQQQQQQQQQQQQQQQQQQQ" + query);
			// STEP 2 , PROCESS
			List<String> list = query.list();

			return list;

		} catch (HibernateException he) {
			System.err.println("HibernateException in fetchAll ," + he.getMessage());
		} finally {
			session.close();
		}
		return null;
	}

	@Override
	public int updateQuantityByBrandName(Integer quantity, String brandName) {
		System.out.println("START:DAO updateQuantityByBrandName " + quantity + " " + brandName);
		Session session = this.factory.openSession();
		try {

			session.beginTransaction();
			// STEP 1
			Query query = session.getNamedQuery("updateQuantityByBrandName");
			query.setParameter("qty", quantity);
			query.setParameter("bn", brandName);
			// STEP 2 PROCESS
			int entitiesUpdated=query.executeUpdate();		
			session.getTransaction().commit();
			return entitiesUpdated;

		} catch (HibernateException he) {
			System.err.println("HibernateException in updateQuantityByBrandName ," + he.getMessage());
			session.getTransaction().rollback();

		} catch (Exception he) {
			System.err.println("Exception in updateQuantityByBrandName ," + he.getMessage());
			session.getTransaction().rollback();
		} finally {
			session.close();
		}
		System.out.println("END: updateQuantityByBrandName " + quantity + " " + brandName);
		return 0;
	}
}
