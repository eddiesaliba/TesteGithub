package principal;

public class Calculadora {
	private float val1;
	private float val2;
	float total;
	
	public Calculadora() {
		val1 = 0;
		val2 = 0;
		total = 0;
	}
	
	public Calculadora(float val1, float vv2) {
		this.val1 = val1;
		val2 = vv2;
	}
	
	public void soma(float a, float b) {
		total = a + b;
	}
	
	void subtracao() {
		total = val1 - val2;
	}
	
	public float multiplicacao(float a) {
		return (a * val2);
	}
	
	public float divisao() {
		if(val2 != 0)
			return val1 / val2;
		else
			return 0;
	}
	
	public void potenciacao() {
		total = (float) Math.pow(val1, val2);
	}
	
	public void setVal1(float a) {
		val1 = a;
	}
	
	public float getVal1() {
		return val1;
	}

	public float getVal2() {
		return val2;
	}

	public void setVal2(float val2) {
		this.val2 = val2;
	}

	public float getTotal() {
		return total;
	}
}
