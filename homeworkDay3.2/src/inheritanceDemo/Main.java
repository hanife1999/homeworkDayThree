package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TarimkrediManager tarimKrediManager = new TarimkrediManager();
//		tarimKrediManager.Hesapla();
		KrediUi krediUi = new KrediUi();
		krediUi.KrediHesapla(new AskerKrediManager());
	}

}
