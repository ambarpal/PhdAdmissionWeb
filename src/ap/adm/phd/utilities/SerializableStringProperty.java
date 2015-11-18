package ap.adm.phd.utilities;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import javafx.beans.property.SimpleStringProperty;

/*
 * @author Rounaq Jhunjhunu Wala 2014089
 * @author Ambar Pal 2014012
 */
public class SerializableStringProperty extends SimpleStringProperty implements Externalizable{
	public SerializableStringProperty() {
		super();
	}
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(get());
    }
 
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        set((String)in.readObject());
    }
}
