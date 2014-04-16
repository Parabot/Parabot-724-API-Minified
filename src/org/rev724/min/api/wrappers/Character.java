package org.rev724.min.api.wrappers;

/**
 * 
 * @author Everel
 * 
 */
public class Character extends Animable {
	private org.rev724.min.accessors.Character accessor;
	private int index;

	public Character(org.rev724.min.accessors.Character accessor, int index) {
		super(accessor);
		this.accessor = accessor;
		this.index = index;
	}

	/**
	 * Index of the character array
	 * 
	 * @return index
	 */
	public int getIndex() {
		return this.index;
	}

	/**
	 * Animation of this character
	 * 
	 * @return animation
	 */
	public int getAnimation() {
		return 0;
	}


	/**
	 * Interacts with this character
	 * 
	 * @param i
	 */
	public void interact(int i) {
		//Menu.interact(this, i);
	}

	/**
	 * Gets current health
	 * 
	 * @return health
	 */
	public final int getHealth() {
		return 0;
	}

	/**
	 * Gets maximum health of this character
	 * 
	 * @return max health
	 */
	public final int getMaxHealth() {
		return 0;
	}

	/**
	 * Fetches loop cycle status
	 * 
	 * @return loop cycle status
	 */
	public final int getLoopCycleStatus() {
		return 0;
	}

	/**
	 * Determines if entity is in combat
	 * 
	 * @return <b>true</b> if entity is in combat
	 */
	public boolean isInCombat() {
		return false;
	}

	/**
	 * Returns the character this character is interacting with
	 * 
	 * @return interacting character
	 */
	public final Character getInteractingCharacter() {
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((accessor == null) ? 0 : accessor.hashCode());
		result = prime * result + index;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Character other = (Character) obj;
		if (accessor == null) {
			if (other.accessor != null)
				return false;
		} else if (!accessor.equals(other.accessor))
			return false;
		if (index != other.index)
			return false;
		return true;
	}

}
