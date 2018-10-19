public class KaryawanTest{
	public static void main(String[] args){
		System.out.println(" Gaji Karyawan PERTAMINA");
		System.out.println(" ");
		Desaigner desainer = new Desaigner();
		desainer.setNama("Sony");
		desainer.setAlamat("Desa Bugel RT 01 RW 01 ");
		desainer.setGaji(50);

		System.out.println(" ");
		Pm projectmanager = new Pm();
		projectmanager.setNama("Eka");
		projectmanager.setAlamat("Desa Bangkir");
		projectmanager.setGaji(100);

		System.out.println(" ");
		Programmer programmer = new Programmer();
		programmer.setNama("IDO ");
		programmer.setAlamat("Cirebon");
		programmer.setGaji(90);

	}
}