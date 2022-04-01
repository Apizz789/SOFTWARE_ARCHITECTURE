package lab09.structural;
public class TaxPayingHealthcareWorker extends HealthcareWorkerDecorator {
	public TaxPayingHealthcareWorker(HealthcareWorker worker) {
		super(worker);
		System.out.println("Decorate"+ worker.getName()+ "with TaxPaying.");
	}
	
	@Override
	public double getPrice() {
		return this.worker.getPrice()*1.1;
	}

}