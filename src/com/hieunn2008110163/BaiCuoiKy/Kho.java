package com.hieunn2008110163.BaiCuoiKy;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Pattern;
public  class Kho {
     static List<hangHoa> hh;
	public static Scanner sc = new Scanner(System.in);
	public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public static void main(String[] args) {
		hh = new ArrayList<>();
		DuLieuCoSan();
		int luachon;
		do {
			System.out.println("***************MENU************");
			System.out.println(""
					+ "**1. them hang hoa\n"
					+ "**2. sua hang hoa\n"
					+ "**3. xoa hang hoa\n"
					+ "**4. tim kiem\n"
					+ "**5. sap xep\n"
					+ "**6. thong ke\n"
					+ "**0. thoat ");
			System.out.println("************************");
			System.out.print("chon chuc nang: ");
			luachon = sc.nextInt();
			switch (luachon) {
			case 1: // Thêm hàng hóa
				themHangHoa();
				break;
			case 2: // sửa hàng hóa
				sc.nextLine();
				System.out.println("nhap ma hang hoa can sua: ");
				String mH = sc.nextLine();
				suaHangHoa(mH);
				break;
			case 3: // xóa hàng hóa
				sc.nextLine();
				System.out.println("nhap ma hang hoa can xoa: ");
				String maHang = sc.nextLine();
				xoaHangHoa(maHang);
				break;
			case 4: // tìm kiếm
				int timkiem;
				do {
					System.out.println("*******HAY NHAP LUA CHON********");
					System.out.println("**1. Tim theo loai");
					System.out.println("**2. Tim theo khoang gia");
					System.out.println("**3. Tim theo khoang ngay nhap");
					System.out.println("**0. Thoat");
					timkiem = sc.nextInt();
					switch (timkiem) {
					// Tìm kiếm theo loại
					case 1:
						int TT_loai;
						do {
							System.out.println("Chon loai hang: ");
							System.out.println("1. Thuc Pham	2. Sanh Su	3. Dien May	");
							System.out.print("hay lua Chon: ");
							TT_loai = sc.nextInt();
							switch (TT_loai) {
							case 1:
								timKiemTheoLoai(Loai.ThucPham);
								break;
							case 2:
								timKiemTheoLoai(Loai.SanhSu);
								break;
							case 3:
								timKiemTheoLoai(Loai.DienMay);
								break;
							default:
								System.out.println("nhap sai, hay nhap lai...");
								break;
							}
						} while (TT_loai != 0);
						break;
					// Tìm kiếm theo giá
					case 2:
						System.out.println("******NHAP GIA*********");
						System.out.print("Gia tu: ");
						double giaTu = sc.nextDouble();
						System.out.print("gia den: ");
						double giaDen = sc.nextDouble();
						sc.nextLine();
						timKiemTheoKhoangGia(giaTu, giaDen);
						break;
					// Tìm kiếm theo ngày
					case 3:
						sc.nextLine();
						System.out.println("******NHAP KHOANG NGAY*******");
						System.out.println("---Tu ngay: ");
						String tuNgay;
						while (true) {
							System.out.println("Nhap ngay: ");
							tuNgay = sc.nextLine();
							if (pattern.matcher(tuNgay).matches()) {
								break;
							} else {
								System.out.println("nhap chua đung dinh dang. Hay nhap lai");
							}
						}
						LocalDate tu = LocalDate.parse(tuNgay, formatter);
						System.out.println("----Đen ngay: ");
						String denNgay;
						while (true) {
							System.out.println("Nhap ngay : ");
							denNgay = sc.nextLine();
							if (pattern.matcher(denNgay).matches()) {
								break;
							} else {
								System.out.println("nhap chua dung dinh dang. Hay nhap lai");
							}
						}
						LocalDate den = LocalDate.parse(denNgay, formatter);
						timKiemTheoKhoangNgay(tu, den);
						break;
					default:
						System.out.println("nhap sai, hay nhap lai...");
						break;
					}
				} while (timkiem != 0);
				break;
			case 5: // sắp xếp
				int f2;
				int tg = 0; // biến check xem tăng hay giảm
				do {
					System.out.println("*******BAN CHON BANG SAP XEP*********");
					System.out.println("1. Sap xep tang dan		2. Sap xep giam dan");
					System.out.print("Ban chon: ");
					f2 = sc.nextInt();
					switch (f2) {
					case 1:
						tg = 1;
						break;
					case 2:
						tg = -1;
						break;
					case 0:
						break;
					default:
						System.out.println("nhap sai, hay nhap lai...!");
						break;
					}

					if (tg != 0) { // khi đã chọn sắp xếp tăng hoặc giảm thì cho chọn sắp xếp theo giá và ngày
						int f3;
						do {
							System.out.println("******HAY CHON*****");
							System.out.println("**1. Sap xep theo gia nhap");
							System.out.println("**2. Sap xep theo ngay nhap");
							System.out.println("**3. Sap xep theo loai va ngay nhap");
							System.out.println("**4. Sap xep theo loai va gia nhap");
							System.out.println("**0. Quay lai");
							System.out.print("chon: ");
							f3 = sc.nextInt();
							sc.nextLine();
							switch (f3) {
							case 1:
								sapXepTheoGia(tg);
								break;
							case 2:
								sapXepTheoNgay(tg);
								break;
							case 3:
								sapXepTheoLoaiVaNgayNhap(tg);
								break;
							case 4:
								sapXepTheoLoaiVaGia(tg);
								break;
							default:
								System.out.println("nhap sai, hay nhap lai...");
								break;
							}
						} while (f3 < 0 || f3 > 4);
					}
				} while (f2 > 2 || f2 < 0);

				break;
			case 6: // thống kê
				int future4;
				do {
					System.out.println("******HAY NHAP LUA CHON******");
					System.out.println("**1. Thong ke tong so luong hang hoa");
					System.out.println("**2. Thong ke tong gia tri nhap kho");
					System.out.println("**3. Thong ke so luong tung loai hang");
					System.out.println("**0. Quay lai");
					System.out.print("Chon: ");
					future4 = sc.nextInt();
					sc.nextLine();
					switch (future4) {
					case 1:
						thongKeTongSLHang();
						break;
					case 2:
						thongKeTongGiaTriKho();
						break;
					case 3:
						thongKeSLTungLoai();
						break;
					case 0:
						break;
					default:
						System.out.println("nhap sai, hay nhap lai...");
						break;
					}
				} while (future4 < 0 || future4 > 3);
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("nhap sai, hay nhap lai...");
				break;
			}
		} while (luachon != 0);
	}
		public static Pattern pattern = Pattern.compile("^\\d{1,2}[/]\\d{1,2}[/]\\d{4}$");
	private static void DuLieuCoSan() {
	//thực phẩm

		hh.add(new hangHoa(Loai.ThucPham, "TP01", "rau cu ", 2000, 60, LocalDate.parse("02/03/2014", formatter)));
		hh.add(new hangHoa(Loai.ThucPham, "TP02", "thit ca", 2000, 60, LocalDate.parse("03/07/2014", formatter)));
		hh.add(new hangHoa(Loai.ThucPham, "TP03", "thuc an nhanh", 2000, 60, LocalDate.parse("01/08/2014", formatter)));
	//sành sứ
		hh.add(new hangHoa(Loai.SanhSu, "SS01", "chen bat", 1200, 3, LocalDate.parse("04/04/2014", formatter)));
		hh.add(new hangHoa(Loai.SanhSu, "SS02", "Bo ban tra su", 4500, 6, LocalDate.parse("05/05/2015", formatter)));
		hh.add(new hangHoa(Loai.SanhSu, "SS03", "Chau Su", 7000, 12, LocalDate.parse("06/06/2007", formatter)));
	//đồ điện
		hh.add(new hangHoa(Loai.DienMay, "DM01", "Laptop", 8000000, 150, LocalDate.parse("07/12/2019", formatter)));
		hh.add(new hangHoa(Loai.DienMay, "DM02", "tivi", 5000000, 25, LocalDate.parse("20/11/2020", formatter)));
		hh.add(new hangHoa(Loai.DienMay, "DM03", "Loa", 3500000, 120, LocalDate.parse("10/03/2018", formatter)));
	}
	private static void timKiemTheoKhoangNgay(LocalDate tuNgay, LocalDate denNgay) {
		List<hangHoa> hangs = new ArrayList<>();
		for (int i = 0; i < hh.size(); i++) {
			if (hh.get(i).getNgayNhap().isAfter(tuNgay) && hh.get(i).getNgayNhap().isBefore(denNgay)) {
				hangs.add(hh.get(i));
			}
		}
		if (hangs.size() == 0) {
			System.out.println("Khong ca san pham nao");
		} else {
			xemHang(hangs);
		}
	}

	private static void timKiemTheoKhoangGia(double giaTu, double giaDen) {
		List<hangHoa> hangs = new ArrayList<>();
		for (int i = 0; i < hh.size(); i++) {
			if (hh.get(i).getGiaNhap() > giaTu && hh.get(i).getGiaNhap() < giaDen) {
				hangs.add(hh.get(i));
			}
		}
		if (hangs.size() == 0) {
			System.out.println("Khong co san pham nao");
		} else {
			xemHang(hangs);
		}
	}

	private static void timKiemTheoLoai(Loai thucpham) {
		List<hangHoa> hangs = new ArrayList<>();
		for (int i = 0; i < hh.size(); i++) {
			if (hh.get(i).getLoai() == thucpham) {
				hangs.add(hh.get(i));
			}
		}
		if (hangs.size() == 0) {
			System.out.println("Khong co san pham nao");
		} else {
			xemHang(hangs);
		}
	}
	private static void thongKeSLTungLoai() {
		int sDienMay = 0, sSanhSu = 0, sThucPham = 0;
		for (hangHoa h : hh) {
			if (h.getLoai().compareTo(Loai.SanhSu) == 0) {
				sSanhSu += h.getSoLuong();
			} else if (h.getLoai().compareTo(Loai.ThucPham) == 0) {
				sThucPham += h.getSoLuong();
			} else {
				sDienMay += h.getSoLuong();
			}
		}
		System.out.println("____THONG KE SO LUONG TUNG LOAI____");
		System.out.printf("%20s%20s%20s%20s\n", "Loai", "ĐIEN MAY", "SANH SU", "THUC PHAM");
		System.out.printf("%20s%20s%20s%20s\n", "So luong", sDienMay + "", sSanhSu + "", sThucPham + "");
	}

	private static void thongKeTongGiaTriKho() {
		long K = 0;
		for (hangHoa h : hh) {
			K += h.getGiaNhap();
		}
		System.out.println("Tong gia tri trong kho: " + K);
	}

	private static void thongKeTongSLHang() {
		int s = 0;
		for (hangHoa h : hh) {
			s += h.getSoLuong();
		}
		System.out.println("Tong so hang trong kho la: " + s);
	}

	private static void sapXepTheoLoaiVaGia(int flag) {
		Collections.sort(hh, new Comparator<hangHoa>() {
			@Override
			public int compare(hangHoa o1, hangHoa o2) {
				if (o1.getLoai().compareTo(o2.getLoai()) != 0) {
					return flag * o1.getLoai().compareTo(o2.getLoai());
				} else {
					double result = flag * (o1.getGiaNhap() - o2.getGiaNhap());
					if (result > 0)
						return 1;
					else if (result < 0)
						return -1;
					else
						return 0;
				}
			}
		});
		xemHang(hh);
	}

	private static void sapXepTheoLoaiVaNgayNhap(int flag) {
		Collections.sort(hh, new Comparator<hangHoa>() {
			@Override
			public int compare(hangHoa o1, hangHoa o2) {
				if (o1.getLoai().compareTo(o2.getLoai()) != 0) {
					return flag * o1.getLoai().compareTo(o2.getLoai());
				} else {
					if (flag == 1) {
						if (o1.getNgayNhap().isBefore(o2.getNgayNhap())) {
							return -1;
						} else {
							return 1;
						}
					} else {
						if (o1.getNgayNhap().isBefore(o2.getNgayNhap())) {
							return 1;
						} else {
							return -1;
						}
					}
				}
			}
		});
		xemHang(hh);
	}

	private static void sapXepTheoNgay(int flag) {
		Collections.sort(hh, new Comparator<hangHoa>() {
			@Override
			public int compare(hangHoa o1, hangHoa o2) {
				if (flag == 1) {
					if (o1.getNgayNhap().isBefore(o2.getNgayNhap())) {
						return -1;
					} else {
						return 1;
					}
				} else {
					if (o1.getNgayNhap().isBefore(o2.getNgayNhap())) {
						return 1;
					} else {
						return -1;
					}
				}
			}
		});
		xemHang(hh);
	}

	private static void sapXepTheoGia(int flag) {
		Collections.sort(hh, new Comparator<hangHoa>() {
			@Override
			public int compare(hangHoa o1, hangHoa o2) {
				double result = flag * (o1.getGiaNhap() - o2.getGiaNhap());
				if (result > 0)
					return 1;
				else if (result < 0)
					return -1;
				else
					return 0;
			}
		});
		System.out.println("____DANH SACH HANG HOA SAP XEP THEO GIA____");
		xemHang(hh);
	}

	private static void xemHang(List<hangHoa> hangs) {
		System.out.printf("%20s%20s%20s%20s%20s%20s\n", "Loai Hang", "Ma Hang", "Ten Hang", "Gia Nhap", "SL Ton Kho",
				"Ngay Nhap Kho");
		for (hangHoa ha : hangs) {
			System.out.printf("%20s%20s%20s%20s%20s%20s\n", ha.getLoai(), ha.getMaHang(), ha.getTenHang(),
					ha.getGiaNhap() + "", ha.getSoLuong() + "", ha.getNgayNhap());
		}
	}
	private static void themHangHoa() {
		sc.nextLine();
		Loai loai = Loai.ThucPham;
		int ch;
		do {
			System.out.println("Chon loai hang: ");
			System.out.println("1. THUC PHAM	2. SANH SU	3. ĐIEN MAY");
			System.out.print("Chon: ");
			ch = sc.nextInt();
			sc.nextLine();
			switch (ch) {
			case 1:
				loai = Loai.ThucPham;
				break;
			case 2:
				loai = Loai.SanhSu;
				break;
			case 3:
				loai = Loai.DienMay;
				break;
			default:
				System.out.println("Loai hang khong ton tai. Hay chon lai");
			}
		} while (ch > 3 || ch < 1);

		String maHang;
		int check = 0;
		do {
			System.out.println("Nhap ma hang: ");
			maHang = sc.nextLine();
			if (maHang.compareTo("") == 0) {
				System.out.println("Ma hang khong duoc de trong. Hay nhap lai!");
			} else {
				maHang = loai + maHang;
				check = kiemTraMaHangTonTai(0, hh.size() - 1, maHang);
				if (check != -1) {
					System.out.println("Ma hang da ton tai. Hay nhap lai");
				}
			}

		} while (maHang.compareTo("") == 0 || check != -1);

		System.out.println("Nhap ten hang: ");
		String tenHang = sc.nextLine();

		System.out.println("Nhap gia nhap: ");
		double giaNhap = sc.nextDouble();

		System.out.println("Nhap so luong ton kho: ");
		int slTonKho = sc.nextInt();
		sc.nextLine();
		String date;
		while (true) {
			System.out.println("Nhap ngay : ");
			date = sc.nextLine();
			if (pattern.matcher(date).matches()) {
				break;
			} else {
				System.out.println("nhap chua dung dinh dang. Hay nhap lai");
			}
		}
		LocalDate ngayNhap = LocalDate.parse(date, formatter);
		hangHoa hangHoa = new hangHoa(loai, maHang, tenHang, giaNhap, slTonKho, ngayNhap);
		hh.add(hangHoa);
		System.out.println("*** Da Them thanh ***");
	}
	private static void suaHangHoa(String maHang) {
		int i = kiemTraMaHangTonTai(0, hh.size() - 1, maHang);
		if (i != -1) {
			System.out.println("*******NHAP LAI THONG TIN HANG: " + maHang + "********");

			System.out.println("Nhap ten hang: ");
			hh.get(i).setTenHang(sc.nextLine());

			System.out.println("Nhap gia nhap: ");
			hh.get(i).setGiaNhap(sc.nextDouble());

			System.out.println("Nhap so luong ton kho: ");
			hh.get(i).setSoLuong(sc.nextInt());
			sc.nextLine();
			String date;
			while (true) {
				System.out.println("Nhap ngay vi du: ");
				date = sc.nextLine();
				if (pattern.matcher(date).matches()) {
					break;
				} else {
					System.out.println("nhap chua dung dinh dang. Hay nhap lai");
				}
			}
			LocalDate ngayNhap = LocalDate.parse(date, formatter);
			hh.get(i).setNgayNhap(ngayNhap);
			System.out.println("******SUA HANG THANH CONG********");
		} else {
			System.out.println("Ma hang khong ton tai");
		}
	}
	private static void xoaHangHoa(String maHang) {
		int i = kiemTraMaHangTonTai(0, hh.size() - 1, maHang);
		if (i != -1) {
			hh.remove(i);
			System.out.println("Xoa hang " + maHang + " thanh cang");
		} else {
			System.out.println("Ma hang khong ton tai");
		}
	}
	// tìm kiếm nhị phân
	private static int kiemTraMaHangTonTai(int l, int r, String maHang) {
		Collections.sort(hh, new Comparator<hangHoa>() {
			@Override //ghi đề P.T
			public int compare(hangHoa _HH1, hangHoa _HH2) {
				return _HH1.getMaHang().compareTo(_HH2.getMaHang());
			}});
		if (r >= l) {
			int mid = l + (r - l) / 2;
			// if 1 P.tử center
			if (hh.get(mid).getMaHang().compareTo(maHang) == 0)	return mid;
			// if P.tử < center -> left side
			if (hh.get(mid).getMaHang().compareTo(maHang) > 0)	return kiemTraMaHangTonTai(l, mid - 1, maHang);
			// else -> right
			return kiemTraMaHangTonTai(mid + 1, r, maHang);
		}
		// TH
		return -1;}}