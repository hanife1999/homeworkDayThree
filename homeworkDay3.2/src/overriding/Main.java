package overriding;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
//		System.out.println(ogretmenKrediManager.hesapla(1000));
		
		BaseKrediManager [] krediManagers = new BaseKrediManager[]
				{ new OgretmenKrediManager(), new TarımKrediManager()};
		for (BaseKrediManager krediManager : krediManagers) {
			
			System.out.println(krediManager.hesapla(1000));
		}

	}

}
