package fr.htc.library.dao;

import java.util.ArrayList;

import fr.htc.library.entity.Member;

public class MemberDao {

public Member save(Member member) {
		
		return LibraryDatabase.getMemberTable().put(member.getMatricule(), member);
	}

public Member findMemberByMatricule(String matricule) {
	
	Member findMember = LibraryDatabase.getMemberTable().get(matricule);
	
	return findMember;
}

public static ArrayList<Member> getAllMembers() {
	return new ArrayList<Member>(LibraryDatabase.getMemberTable().values());
}


public void delete(Member member) {
	this.delete(member.getMatricule());
}

public void delete(String matricule) {
	LibraryDatabase.getBookTable().remove(matricule);
}




}
