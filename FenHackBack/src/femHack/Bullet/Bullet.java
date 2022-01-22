package femHack.Bullet;

import com.google.gson.Gson;

public class Bullet {

	private static int count = 0; 
	private int id;

	private int v0;
	private int alpha; 
	private boolean save;
	private boolean typeData;
	private double h_max;
	private double x_max;
	
	
	public Bullet() {
	}

	public Bullet(int v0, int alpha, boolean save, boolean typeData) {
		this.id = ++count;
		this.v0 = v0;
		this.alpha = alpha;
		this.save = save;
		this.typeData = typeData;
		this.h_max = calculateH_max();
		this.x_max = calculateX_max();
	}

	public Bullet(int id, int v0, int alpha, boolean save, boolean typeData) {
		this.id=id;
		this.id = ++count;
		this.v0 = v0;
		this.alpha = alpha;
		this.save = save;
		this.typeData = typeData;
		this.h_max = calculateH_max();
		this.x_max = calculateX_max();
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getv0() {
		return 0;
	}

	public void setv0(int v0) {
		this.v0 = v0;
	}

	public int getAlpha() {
		return alpha;
	}

	public void setAlpha(int alpha) {
		this.alpha = alpha;
	}

	public boolean isSave() {
		return save;
	}

	public void setSave(boolean save) {
		this.save = save;
	}

	public boolean isTypeData() {
		return typeData;
	}

	public void setTypeData(boolean typeData) {
		this.typeData = typeData;
	}

	public double getH_max() {
		return h_max;
	}

	public void setH_max(double h_max) {
		this.h_max = h_max;
	}

	public double getX_max() {
		return x_max;
	}

	public void setX_max(double x_max) {
		this.x_max = x_max;
	}

	@Override
	public String toString() {
		return "Bullet [id=" + id + ", v0=" + v0 + ", alpha=" + alpha + ", save=" + save + ", typeData=" + typeData
				+ ", h_max=" + h_max + ", x_max=" + x_max + "]";
	}
	public String toJson() {
		String json = new Gson().toJson(this);
		return json;
	}
	
	public double calculateH_max() {
		double hmax=(this.v0*this.v0)/(2*9.8);
		return hmax;
	}
	
	public double calculateX_max() {
		double x_max=2*this.v0*Math.sin(alpha)/9.8;
		return x_max;
	}
	//you can set de id whith json whith the final count
	public int incrementId() {
		int id=++count;
		return id;
	}
}
