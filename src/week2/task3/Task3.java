package week2.task3;

public class Task3 {
}

class XayNha
    {
        private int xM; // so luong xi mang uoc tinh
        private int sT; // so luong sat thep uoc tinh
        private int g; // so luong gach  uoc tinh
        private int sizeG; // n*n
        private float cDai;
        private float cRong;

    public XayNha() {
    }

    public XayNha(int xM, int sT, int g, int sizeG, float cDai, float cRong) {
        this.xM = xM;
        this.sT = sT;
        this.g = g;
        this.sizeG = sizeG;
        this.cDai = cDai;
        this.cRong = cRong;
    }
   
    public void setcRong(float cRong) {
        this.cRong = cRong;
    }

    public void setcDai(float cDai) {
        this.cDai = cDai;
    }

    public int getSizeG() {
        return sizeG;
    }

    public void setSizeG(int sizeG) {
        this.sizeG = sizeG;
    }

    public float getcRong() {
        return cRong;
    }

    public float getcDai() {
        return cDai;
    }

    public void setcRong(int cRong) {
        this.cRong = cRong;
    }

    public void setcDai(int cDai) {
        this.cDai = cDai;
    }

        public void setG(int g) {
            this.g = g;
        }

        public void setsT(int sT) {
            this.sT = sT;
        }

        public void setxM(int xM) {
            this.xM = xM;
        }
        
        public int getsT() {
            return sT;
        }

        public int getxM() {
            return xM;
        }

        public int getG() {
            return g;
        }
        float S()
        {
            return this.cDai*this.cRong;
        }
        int PhanNen()  //  uoc tinh can bao nhieu so luong xi mang , gach , soi
        {
            // tinh ra dien tich roi chia theo size cua gach duoc so vien gach
            float s = S();
                       
            return (int)(s/getSizeG());
        }
        int PhanMaiNha() // can bao nhieu ngoi lop
        {
            // tuong tu nhu phan nen           
            return 0;
        }
        void PhanTrong(String mau) //  son mau gi, trang tri the nao?
        {
            switch(mau)
            {
                case "Hong":System.out.println("Chu nha chon mau hong");
                case "Tranng":System.out.println("Chu nha chon mau trang");
                case "Xanh" :System.out.println("Chu nha chon mau xanh");
                default:System.out.println("The nao cung duoc");
            }
        }
        
}

class Cat{
    private float cdai;
    private float crong;
    private String tiengkeu;
    private int tuoi; // tuan tuoi

    public Cat(float cdai, float crong, String tiengkeu) {
        this.cdai = cdai; // cm
        this.crong = crong; // cm
        this.tiengkeu = tiengkeu; 
    }

    public void setCdai(float cdai) {
        this.cdai = cdai;
    }

    public float getCrong() {
        return crong;
    }

    public String getTiengkeu() {
        return tiengkeu;
    }

    public void setCrong(float crong) {
        this.crong = crong;
    }

    public void setTiengkeu(String tiengkeu) {
        this.tiengkeu = tiengkeu;
    }

    public float getCdai() {
        return cdai;
    }

    public int getTuoi() {
        return tuoi;
    }
    
    public void canNangLyTuong()
    {
        int old = getTuoi();
        if(old >=1 && old <=2)
        {
            System.out.println("85g-198g");
        }
        else if(old>2 && old <=6)
        {
            System.out.println("236g-0.9kg");
        }
        else if(old > 6 && old<=10)
        {
            System.out.println("1kg - 1.4kg");
        }
        else
        {
            System.out.println("1.5kg-2.5kg");
        }
            
    }
    void MeoKeuTuoi() { // tieng meo keu theo can nang
		if(this.tuoi >= 1 && this.tuoi < 5) {
			System.out.println("Miw Miw!!! Miw Miw!!!");
		}
		else if(this.tuoi >5 && this.tuoi <=10 ) {
			System.out.println("Miao Miao!!! Miao Miao!!!");
		}
		else
			System.out.println("Meaoooo Meaoooo!!! Meaoooo Meaoooo!!!");
	}
    public void dacDiemMeo()
    {
        System.out.println("Thông thường mèo nặng từ 2,5 đến 7 kg (5,5–16 pao); tuy nhiên, một số giống như Maine Coon có thể vượt quá 11,3 kg (25 pao). Một số chú mèo từng đạt tới trọng lượng 23 kg (50 pao) vì được cho ăn quá nhiều. Điều này rất có hại cho sức khỏe mèo - khiến chúng có thể bị đái đường, đặc biệt đối với mèo đực đã thiến - có thể ngăn chặn tình trạng này thông qua biện pháp ăn kiêng và tập luyện (chạy nhảy), đặc biệt đối với những chú mèo luôn ở trong nhà. Trái lại, cũng có những chú mèo rất nhỏ (chưa tới 1,8 kg - 4,0 pao).[9");
    }
    
    
}

class LapTrinhVien{
    
    private int tuoi;
    private int cNang; // can nang
    private int cCao;// chieu cao;
    private int mautoc; 
    private int quequan;
    private String name;
    private int timetoW; // thoi gian lam viec
    private float makeMoneyOnDay;  
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LapTrinhVien(int tuoi, int cNang, int cCao, int mautoc, int quequan, String name) {
        this.tuoi = tuoi;
        this.cNang = cNang;
        this.cCao = cCao;
        this.mautoc = mautoc;
        this.quequan = quequan;
        this.name = name;
    }
    public void setMautoc(int mautoc) {
        this.mautoc = mautoc;
    }

    public int getMautoc() {
        return mautoc;
    }

    public int getQuequan() {
        return quequan;
    }

    public int getcCao() {
        return cCao;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setcNang(int cNang) {
        this.cNang = cNang;
    }

    public void setcCao(int cCao) {
        this.cCao = cCao;
    }

    public int getcNang() {
        return cNang;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setQuequan(int quequan) {
        this.quequan = quequan;
    }

    public LapTrinhVien() {
    }
    public void KyNang()
    {
        //
    }
    
    public float luongThang()  //  tinh theo so gioi lam viec;
    {
     
       return makeMoneyOnDay*timetoW;
    }
    public void CodeTheoTuoi()
    {
        
        if(tuoi>=18 && tuoi <=25)
        {
            System.out.println("Thông minh -Đam mê nhiệt huyết cao- trình độ càng ngày càng lên");
        }
        else if(tuoi >25 && tuoi <=30)
        {
            System.out.println("Giai đoạn đỉnh cao - Tính sáng tạo - đam mê - code everything!!");
        }
        else
        {
            System.out.println("Tât cả vẫn vậy - nhưng tư duy bị mai một - khả năng sáng tạo bị hạn chế");
        }
              
            
    }
    public LapTrinhVien SoSanh(LapTrinhVien n1 , LapTrinhVien n2)
    {
        if(n1.luongThang() > n2.luongThang())
        {
            return n1;
        }
        else 
        {
            return n2;
        }
        
    }
    

	



    
    
}
