abstract class XeMay
{

	abstract void  brake();
}

class XeMayTheThao extends XeMay
{

	@Override
	public void brake()
	{

		System.out.println("Xe May The Thao Chat Luong");
	}
}

class XeMayLeoNui extends XeMay
{
	@Override
	public void brake()
	{

		System.out.println("Xe May Leo Nui Chat Luong");
	}
}

public class TheThao
{

	public static void main(String[] args) 
	{
		XeMayTheThao xmtt = new XeMayTheThao();
		xmtt.brake();

		XeMayLeoNui xmln = new XeMayLeoNui();
		xmln.brake();
	
	}
}