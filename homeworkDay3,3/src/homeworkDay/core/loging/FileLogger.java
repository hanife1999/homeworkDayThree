package homeworkDay.core.loging;

public class FileLogger implements Logger{

	@Override
	public void log(String data) {
		// TODO Auto-generated method stub
		System.out.println("Dosya gönderildi : " + data);
		
	}

}
