package fr.htc.library.services;

import java.util.ArrayList;
import java.util.List;


import fr.htc.library.dao.MemberDao;
import fr.htc.library.entity.Book;
import fr.htc.library.entity.Member;

public class MemberService {

	private MemberDao memberDao = new MemberDao();

	public Member save(String nom, String prenom, int age, int nbCheckin) {

		if (nom == null) {
			System.out.println("Save book aborted : Title is mandatory!!! : " + nom.toString());
			return null;
		}
		if (prenom == null) {
			System.out.println("Save book aborted : Author is mandatory!!! : " + prenom);
			return null;
		}
		if (age < 18) {
			System.out.println("Save book aborted : Edition year is mandatory!!! : " + age);
			return null;
		}
		
		if( nbCheckin > 3) {
			System.out.println("Hy " + nom +" "+ prenom +" impossible to borrow more than 3 books at the same time. " );
			return null;
		}
		
		// else new member creation
		
	Member member = new Member( nom,  prenom,  age,  nbCheckin);
		
		Member savedMember = memberDao.save(member);
				
		return savedMember;

	}

	public List<Member> findAllMembers() {
		ArrayList<Member> memberList = new ArrayList<>(memberDao.getAllMember());
		return memberList;
	}
	
	public Member findMembersByMatricule(String matricule) {
		return null;
}
}
