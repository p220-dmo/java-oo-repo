package fr.htc.library.services;

import java.util.ArrayList;
import java.util.List;


import fr.htc.library.dao.MemberDao;
import fr.htc.library.entity.Member;

public class MemberService {

	private MemberDao memberDao = new MemberDao();

	public Member save(String nom, String prenom, int age, int nbCheckin) {
		
		if (nom == null) {
			System.out.println("Save member aborted : nom is mandatory!!! : " + nom.toString());
			return null;
		}
		if (prenom == null) {
			System.out.println("Save member aborted : prenom is mandatory!!! : " + prenom);
			return null;
		}
		if ( age < 18 & age > 100   ) {
			System.out.println("Save member aborted :  age is mandatory!!! : " + age);
			return null;
		}
		if( nbCheckin == 3) {
			System.out.println("you can't borrow 3 books at the same time " + nbCheckin);
			return null;
		}
		//Arrivée ici: je peut enfin créer un membre 
		
		Member member = new Member( nom,  prenom,  age,  nbCheckin);
		
		Member savedMember = memberDao.save(member);
				
		return savedMember;
	}
	
	public static List<Member> findAllMembers() {
		ArrayList<Member> memberList = new ArrayList<>(MemberDao.getAllMembers());
		return memberList;
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}
	
}
