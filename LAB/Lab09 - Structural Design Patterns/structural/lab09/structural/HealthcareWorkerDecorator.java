package lab09.structural;

public abstract class HealthcareWorkerDecorator extends HealthcareWorker {
	public HealthcareWorkerDecorator(HealthcareWorker worker) {
		super(worker);
		this.worker = worker;
	}

	protected HealthcareWorker worker;
	public void service() {
		this.worker.service();
	}
	public double getPrice() {
		return this.worker.getPrice();
	}
	
}