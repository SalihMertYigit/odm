
public class util {
	
	public static void aracBilgileriSetle(OtomobilRequest otomobilRequest, 
			OtomobilResponse otomobilResponse) {
		
		otomobilResponse.getOtomobilBilgileri()
		.setMarka(otomobilRequest.getMusteriBilgileri().
				getOtomobilBilgileri().getMarka());
		otomobilResponse.getOtomobilBilgileri()
		.setArabaYasi(otomobilRequest.getMusteriBilgileri().
				getOtomobilBilgileri().getArabaYasi());
		otomobilResponse.getOtomobilBilgileri()
		.setAracDeger(otomobilRequest.getMusteriBilgileri().
				getOtomobilBilgileri().getAracDeger());
		otomobilResponse.getOtomobilBilgileri()
		.setAracTuru(otomobilRequest.getMusteriBilgileri().
				getOtomobilBilgileri().getAracTuru());
		otomobilResponse.getOtomobilBilgileri()
		.setMotorHacmi(otomobilRequest.getMusteriBilgileri().
				getOtomobilBilgileri().getMotorHacmi());
		otomobilResponse.getOtomobilBilgileri()
		.setTramerKaydi(otomobilRequest.getMusteriBilgileri().
				getOtomobilBilgileri().getTramerKaydi());
		
		
	}

}
