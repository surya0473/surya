package com.sv.dao.utility;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class UniqueID {
	public static String next() {
		UUID u = UUID.randomUUID();
		return (toIDString(u.getLeastSignificantBits()));
	}

	private static String toIDString(long i) {
		char[] buf = new char[32];
		int z = 62; // 1 << 6;
		int cp = 31;
		long b = z - 1;
		do {
			buf[--cp] = DIGITS62[(int) (i & b)];
			i >>>= 6;
		} while (i != 0);
		return new String(buf, cp, (32 - cp));
	}

	private final static char[] DIGITS62 = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e',
			'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
			'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
			'V', 'W', 'X', 'Y', 'Z' };

}
