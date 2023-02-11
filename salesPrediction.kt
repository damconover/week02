int main()
{
	double PoTS 		= .62,
		   CompSales 	= 4600000;
	int    EastCoastSales		= CompSales * PoTS;

	cout << "The East Coast division is predicted to generate $";
	cout << EastCoastSales << " in sales." << endl; 
	return 0;
}
