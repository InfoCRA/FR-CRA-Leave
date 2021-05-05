package fr.infocom.cra.leave.models;

/**
 * <b>TypeCollaborator is a representation of the status of a staff member of
 * Infocom Group.</b>
 * <p>
 * A TypeCollaborator is identified with this informations :
 * <ul>
 * <li>A unique identificator id.</li>
 * <li>A name for the type</li>
 * </ul>
 * </p>
 * 
 * @author ibenhsine
 * @version 1.0
 *
 */

public class TypeCollaborator {
	private int id;
	private String type;

	/**
	 * Create a new instance of TypeCollaborator object with no arguments
	 */
	public TypeCollaborator() {
	}

	/** Create a new instance of TypeCollaborator object
	 * @param id the int representing a unique identification TypeCollaborator
	 * @param type a String representing the status of the Collaborator
	 */
	public TypeCollaborator(int id, String type) {
		super();
		this.id = id;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "TypeCollaborator [id=" + id + ", type=" + type + "]";
	}
}