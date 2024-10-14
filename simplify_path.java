class Solution {
    public String simplifyPath(String s) {
       Stack<String> a= new Stack<>();
       StringBuilder res=new StringBuilder();
       String[] d=s.split("/");
       int i,j;
       for(i=0;i<d.length;i++)
       {
        if(!a.isEmpty() && d[i].equals(".."))
        {
            a.pop();
        }
        else if(!d[i].equals("")&& !d[i].equals(".") && !d[i].equals(".."))
        {
            a.push(d[i]);
        }
       }
       if (a.isEmpty())
       {
        return "/";
       }
       else
       {
        while(!a.isEmpty())
        {
            res.insert(0,a.pop()).insert(0,"/");
        }
       }
       return res.toString();
        
    }
}