public class JamieList<T>
{
    private ArrayList<T> list;
    
    public JamieList()
    {
        list = new ArrayList<T>();
    }
    
    
    public void add(T x)
    {
        list.add(x);
    }
    
    public void addAll(T... xs)
    {
        for (T x : xs)
        {
            this.add(x);
        }
    }
    
    public T get(int index)
    {
        try
        {
            return list.get(index);
        }
        catch (IndexOutOfBoundsException e)
        {
            return null;
        }
    }
    
    public int size()
    {
        return list.size();
    }
    
    public boolean hasItems()
    {
        return !(list.isEmpty());
    }
    
    public void remove(int index)
    {
        list.remove(index);
    }
    
    public void removeAll(int... indexes)
    {
        for (int index : indexes)
        {
            this.remove(index);
        }
    }
    
    public T getTop()
    {
        return this.get(this.size() - 1);
    }
    
    public void clear()
    {
        list.clear();
    }
    
    public Object[] toArray()
    {
        Object[] elems = new Object[this.size()];
        for (int i = 0; i < this.size(); i++)
        {
            elems[i] = this.get(i);
        }
        return elems;
    }
    
    public void deleteList()
    {
        super.finalize();
    }
}
