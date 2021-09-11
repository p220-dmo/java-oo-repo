package fr.htc.library.dao;

import java.util.Collection;

import fr.htc.library.entity.Member;

public class MemberDao {

	public Member save(Member member) {
		
		LibraryDatabase.getMemberTable().put(member.getMatricule(),member);
		return LibraryDatabase.getMemberTable().get(member.getMatricule());
	}
	
	
	public Member getBookByMatricule(String matricule) {
		
		Member findMember = LibraryDatabase.getMemberTable().get(matricule);
		
		return findMember;
	}
	
	
	public Collection<Member> getAllMember() {
		return LibraryDatabase.getMemberTable().values();
	}
	
	
	public void delete(Member member) {
		this.delete(member.getMatricule());
	}
	
	public void delete(String matricule) {
		LibraryDatabase.getMemberTable().remove(matricule);
	}
	
}
