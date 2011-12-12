/**
 * 
 */
package finalproject;


/**
 * This class represents a Weigthted Document, i.e. a Document that could be ranked.
 * @author jeremiemartinez
 *
 */
public class WeightedDocument extends GenericDocument{
	
	private VectorTermSpace vector;
	
	public WeightedDocument(int id, String title) {
		super(id, title);
	}

	public VectorTermSpace getVector() {
		return vector;
	}

	public void setVector(VectorTermSpace vector) {
		this.vector = vector;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof WeightedDocument)
			if (this.getId() == ((GenericDocument)o).getId()){
				return true;
			} else{
				return (this.getVector()).equals(((WeightedDocument)o).getVector());
			}
		else
			return false;
	}

	public static WeightedDocument create(GenericDocument d) {
		
		return new WeightedDocument(d.getId(), d.getTitle());
	}
	
	
}
