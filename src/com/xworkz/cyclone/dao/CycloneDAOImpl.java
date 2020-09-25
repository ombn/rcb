package com.xworkz.cyclone.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.cyclone.dto.CycloneDTO;
import com.xworkz.cyclone.singleton.SFUtil;

public class CycloneDAOImpl implements CycloneDAO {

	private SessionFactory factory = SFUtil.getFactory();

	public CycloneDAOImpl() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	public void create(CycloneDTO entity) {

		Session session = factory.openSession();
		
		try {
			System.out.println("Start: create " + entity);
			System.out.println("Factory " + factory);

			System.out.println("starting transaction");
			Transaction transaction = session.beginTransaction();
			System.out.println("saving " + entity);
			session.saveOrUpdate(entity);
			session.flush();
			transaction.commit();
			System.out.println("committed transaction");
		} catch (Exception e) {
			System.err.println("Exception in  create " + e.getMessage());
			session.getTransaction().rollback();
			
		} finally {
			System.out.println("closing session");
			session.close();
		}

		System.out.println("End: create " + entity);

	}

	@Override
	public CycloneDTO fetchById(int id) {

		System.out.println("Start: fetchById " + id);

		CycloneDTO cycloneDTO = null;
		System.out.println("Factory " + factory);
		Session session = factory.openSession();
		System.out.println("starting transaction");
		Transaction transaction = session.beginTransaction();
		cycloneDTO = session.get(CycloneDTO.class, id);
		if (cycloneDTO != null) {
			System.out.println("cycloneDTO found for id" + id);
		} else {
			System.out.println("cycloneDTO not found for id" + id);
		}
		transaction.commit();
		System.out.println("committed transaction");
		session.close();
		System.out.println("End: fetchById " + id);

		return cycloneDTO;

	}

	public void updateAreaAffectedById(double area, int pk) {
		System.out.println("Start: updateAreaAffectedById " + area + " " + pk);
		System.out.println("Factory " + factory);
		Session session = factory.openSession();
		System.out.println("starting transaction");
		Transaction transaction = session.beginTransaction();
		CycloneDTO cycloneDTO = session.get(CycloneDTO.class, pk);
		if (cycloneDTO != null) {
			System.out.println("cycloneDTO found for id , can update " + pk);
			System.out.println("updating AreaAffected " + area);
			cycloneDTO.setAreaAffected(area);

			session.update(cycloneDTO);
			transaction.commit();

		} else {
			System.out.println("cycloneDTO not found for id , cannot update" + pk);
		}
		System.out.println("committed transaction");
		session.close();
		System.out.println("END: updateAreaAffectedById " + area + " " + pk);
	}

	
	public CycloneDTO differenceBetweenGetAndLoad(int id)
	{
		
		Session session=factory.openSession();
		try{
			
			CycloneDTO cycloneDTO=session.load(CycloneDTO.class, id);
			//CycloneDTO cycloneDTO1=session.load(CycloneDTO.class,id);
			//CycloneDTO cycloneDTO2=session.load(CycloneDTO.class, id);
			return cycloneDTO;
			//System.out.println(cycloneDTO);			
			//CycloneDTO cycloneDTO1=session.get(CycloneDTO.class, 500);
			//System.out.println(cycloneDTO1);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return null;
		
	}
	
	
	@Override
	public void saveList(List<CycloneDTO> list) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public CycloneDTO update(CycloneDTO cycloneDTO) {
		// TODO Auto-generated method stub
		return null;
	}
}
