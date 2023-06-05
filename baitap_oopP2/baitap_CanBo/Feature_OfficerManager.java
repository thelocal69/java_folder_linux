package baitap_CanBo;

public interface Feature_OfficerManager {
	void addOfficer();

	void showOfficer();

	void findOfficerByNameRelative(String nameOfficer);

	void findOfficerByNameAbsolute(String nameOfficer);

	void deleteOfficerByNameAndAge(String nameOfficer, int age);
}
