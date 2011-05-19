
package de.iritgo.skillfull.component.common;


import com.artemis.Component;


public class Expires extends Component
{
	private int lifeTime;

	public Expires ()
	{
	}
	
	public Expires (int lifeTime)
	{
		this.lifeTime = lifeTime;
	}

	public int getLifeTime ()
	{
		return lifeTime;
	}

	public void setLifeTime (int lifeTime)
	{
		this.lifeTime = lifeTime;
	}

	public void reduceLifeTime (int lifeTime)
	{
		this.lifeTime -= lifeTime;
	}

	public boolean isExpired ()
	{
		return lifeTime <= 0;
	}
}
