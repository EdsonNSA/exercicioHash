package hash;
public class EstruturaHashTable implements EstruturaDeDados{

    private Integer tabela[];

    public EstruturaHashTable() {
        tabela = new Integer[1000];
    }
   
    @Override
    public boolean insert(int chave) {
        int local = chave % 1000;
        if (tabela[local] == null) 
        {
            tabela[local] = chave;
            return true;
        }
        else 
        {
            return false;
        } 
        
        

    }

    @Override
    public boolean delete(int chave) {
        int local = chave % 1000;
        if (tabela[local] != null)
        {
            tabela[local] = null;
            return true;
        }
        else 
        {
            return false;
        } 
        
        
    }

    @Override
    public boolean search(int chave) {
        int local = chave % 1000;
        if(tabela[local] != null)
        {
            if(tabela[local] == chave)
            {
                return true;
            }
        }
        return false;
    }
}
