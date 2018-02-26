/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.daoImpl;

import com.mycompany.biller.dto.Party;
import com.mycompany.biller.dto.PartyRole;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mycompany.biller.dao.PartyRoleDAO;

/**
 *
 * @author ismail
 */

@Repository
public class PartyRoleDAOImpl implements PartyRoleDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addPartyRole(PartyRole partyRole) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(partyRole);
    }

    @Override
    public void updatePartyRole(PartyRole partyRole) {
        Session session = sessionFactory.getCurrentSession();
        session.update(partyRole);
    }

    @Override
    public void deletePartyRole(int partyRoleId) {
        Session session = sessionFactory.getCurrentSession();
        PartyRole partyRole = (PartyRole) session.load(PartyRole.class, new Integer(partyRoleId));
        if (partyRole != null) {
            session.delete(partyRole);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<PartyRole> listAllPartyRole() {
        Session session = sessionFactory.getCurrentSession();
        List<PartyRole> partyRoleList = session.createQuery("from PartyRole").list();
        return partyRoleList;
    }

    @Override
    public List<PartyRole> findPartyRoleById(int partyRoleId) {
        String selectQuery = "FROM PartyRole WHERE PARTY_ROLE_ID = :partyRoleId";
        return sessionFactory
                .getCurrentSession()
                .createQuery(selectQuery)
                .setParameter("partyRoleId", partyRoleId)
                .list();
    }

}
