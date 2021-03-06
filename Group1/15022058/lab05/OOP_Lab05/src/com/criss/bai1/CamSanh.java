package com.criss.bai1;

public class CamSanh extends QuaCam{
	private String hinhDangVo;

	public CamSanh(String ten, int giaTien, String nguonGoc, String ngayNhapHang, int soLuong, String mauSac,
			String hinhDangVo) {
		super(ten, giaTien, nguonGoc, ngayNhapHang, soLuong, mauSac);
		this.hinhDangVo = hinhDangVo;
	}

	public CamSanh() {
		super();
	}
	

	public String getHinhDangVo() {
		return hinhDangVo;
	}

	public void setHinhDangVo(String hinhDangVo) {
		this.hinhDangVo = hinhDangVo;
	}

	@Override
	public String toString() {
		return "CamCaoPhong [hinhDangVo=" + hinhDangVo + ", mauSac=" + mauSac + ", ten=" + ten + ", giaTien=" + giaTien
				+ ", nguonGoc=" + nguonGoc + ", ngayNhapHang=" + ngayNhapHang + ", soLuong=" + soLuong + "]";
	}
	
}
