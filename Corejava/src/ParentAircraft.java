
public class ParentAircraft extends ChildAircaft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentAircraft pa = new ParentAircraft();
		pa.Engine();
		pa.Colour();
		pa.GetBody();
	}

	@Override
	public void GetBody() {
		// TODO Auto-generated method stub
		System.out.println("this is body colour");
	}

}
