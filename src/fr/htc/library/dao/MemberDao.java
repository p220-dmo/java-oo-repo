package fr.htc.library.dao;

import java.util.ArrayList;
import fr.htc.library.entity.Member;

public class MemberDao {
	
public void save(Member member) {
		
		LibraryDatabase.getMemberTable().put(member.getMatricule(), member);
	}

public Member getMemberByMatricule(String matricule) {
	
	Member findMember = LibraryDatabase.getMemberTable().get(matricule);
	
	return findMember;
}

public ArrayList<Member> getAllMembers() {
	return new ArrayList<Member>(LibraryDatabase.getMemberTable().values());
}


public void delete(Member member) {
	this.delete(member.getMatricule());
}

public void delete(String matricule) {
	LibraryDatabase.getBookTable().remove(matricule);
}
}
