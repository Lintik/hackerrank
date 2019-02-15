#include<bits/stdc++.h>
using namespace std;

class Box{
    private:
        int l, b, h;
    public:
        Box(): l(0), b(0), h(0){}
        Box(int length, int breadth, int height){
            l = length;
            h = height;
            b = breadth;
        }
        Box(Box& box){
            this->l = box.l;
            this->b = box.b;
            this->h = box.h;
        }
        int getLength(){
            return l;
        }
        int getBreadth (){
            return b;
        }
        int getHeight (){
            return h;
        }
        long long CalculateVolume(){
            return (long long)l * (long long)h * (long long)b;
        }
    
        bool operator<(Box& b){
            if(this->l < b.l)
                return true;
            else if(this->b < b.b && this->l == b.l)
                return true;
            else if(this->h < h&& this->b == b.b && this->l == b.l)
                return true;
            else
                return false;
        }
        friend ostream& operator<<(ostream& out, const Box& B);
};

ostream& operator<<(ostream& out, Box& B){
            out << B.getLength() << ' ' << B.getBreadth() << ' ' << B.getHeight();
            return out;  
}
void check2()
{
	int n;
	cin>>n;
	Box temp;
	for(int i=0;i<n;i++)
	{
		int type;
		cin>>type;
		if(type ==1)
		{
			cout<<temp<<endl;
		}
		if(type == 2)
		{
			int l,b,h;
			cin>>l>>b>>h;
			Box NewBox(l,b,h);
			temp=NewBox;
			cout<<temp<<endl;
		}
		if(type==3)
		{
			int l,b,h;
			cin>>l>>b>>h;
			Box NewBox(l,b,h);
			if(NewBox<temp)
			{
				cout<<"Lesser\n";
			}
			else
			{
				cout<<"Greater\n";
			}
		}
		if(type==4)
		{
			cout<<temp.CalculateVolume()<<endl;
		}
		if(type==5)
		{
			Box NewBox(temp);
			cout<<NewBox<<endl;
		}

	}
}

int main()
{
	check2();
}
