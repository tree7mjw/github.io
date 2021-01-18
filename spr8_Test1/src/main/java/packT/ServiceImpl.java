package packT;

public class ServiceImpl implements ServiceInter {
	private RepoInter inter;
	
	public ServiceImpl() {	//기본 생성자
		
	}
	public ServiceImpl(RepoInter inter) {	//연결 생성자
		this.inter = inter;
	}
	
	public void gugu_process() {
		//System.out.println("gugu_process() 수행");
		inter.gugu();
	}
	
}
