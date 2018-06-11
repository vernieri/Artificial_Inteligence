public double [] testa_backpropagation(double [][]vv0, double [][]vv, double ww0, double [][]ww){

System.out.println("pesos w0" + ww0);

for(int j=0, j<=5; j++){
	System.out.println("pesos v0[" + j + "]" + vv0[j][0]);
	System.out.println("pesos v[" + j + "]" + vv[j][0]);
	System.out.println("pesos w[" + j + "]" + ww[j][0]);
}

for(int x = 0; x < t.length; x++){
	zz[0][0] = v0[0][0] + t[x]*v[0][0];
	zz[1][0] = v0[0][0] + t[x]*v[1][0];
	zz[2][0] = v0[0][0] + t[x]*v[2][0];
	zz[3][0] = v0[0][0] + t[x]*v[3][0];
	zz[4][0] = v0[0][0] + t[x]*v[4][0];
	zz[5][0] = v0[0][0] + t[x]*v[5][0];


	zzf[0][0] = 2 / (1+ (Math.exp(-zz[0][0])))-1;
	zzf[1][0] = 2 / (1+ (Math.exp(-zz[1][0])))-1;
	zzf[2][0] = 2 / (1+ (Math.exp(-zz[2][0])))-1;
	zzf[3][0] = 2 / (1+ (Math.exp(-zz[3][0])))-1;
	zzf[4][0] = 2 / (1+ (Math.exp(-zz[4][0])))-1;
	zzf[5][0] = 2 / (1+ (Math.exp(-zz[5][0])))-1;

	zzff[0][0] = 0.5*(1+zz[0][0])*(1-zz[0][0]);
	zzff[1][0] = 0.5*(1+zz[1][0])*(1-zz[1][0]);
	zzff[2][0] = 0.5*(1+zz[2][0])*(1-zz[2][0]);
	zzff[3][0] = 0.5*(1+zz[3][0])*(1-zz[3][0]);
	zzff[4][0] = 0.5*(1+zz[4][0])*(1-zz[4][0]);
	zzff[5][0] = 0.5*(1+zz[5][0])*(1-zz[5][0]);

	yy[x] = w0 + zzf[0][0]*w[0][0] + zzf[1][0]*w[1][0] + zzf[2][0]*w[2][0] + zzf[3][0]*w[3][0] + zzf[4][0]*w[4][0] + zzf[5][0]*w[5][0];

	yyf[x] = 2 / (1+(Math.exp(-yy[x])))-1;

}

int k = 0;
    for (int i = 0; i < 300; i++)
       Yamanaka[i] = t[i];
     for (int j = 300; j < 600; j++){
       Yamanaka[j] = yyf[k];
}
  return Yamanaka;
 }
}
