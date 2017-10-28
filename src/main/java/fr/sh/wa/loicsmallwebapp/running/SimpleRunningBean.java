package fr.sh.wa.loicsmallwebapp.running;

public class SimpleRunningBean {

	protected int timeTrain;
	protected int nbMinWork;
	protected int nbSecWork;
	
	/**
	 * 
	 * @param t timeTrain
	 * @param mw nbMinWork
	 * @param nsw nbSecWork
	 */
	public SimpleRunningBean(int t, int mw, int nsw)
	{
		timeTrain = t;
		nbMinWork = mw;
		nbSecWork = nsw;
	}

	public int getTimeTrain() {
		return timeTrain;
	}

	public void setTimeTrain(int timeTrain) {
		this.timeTrain = timeTrain;
	}

	public int getNbMinWork() {
		return nbMinWork;
	}

	public void setNbMinWork(int nbMinWork) {
		this.nbMinWork = nbMinWork;
	}

	public int getNbSecWork() {
		return nbSecWork;
	}

	public void setNbSecWork(int nbSecWork) {
		this.nbSecWork = nbSecWork;
	}
	
	
	
}
