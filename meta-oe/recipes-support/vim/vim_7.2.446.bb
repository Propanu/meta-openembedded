require ${PN}.inc

PR = "${INC_PR}.0"

# 001-446; 401-446 are not yet available online
SRC_URI += "http://ftp.vim.org/pub/vim/patches/7.2/7.2.001-100.gz;name=p001-100;apply=yes;patchdir=..;pnum=0"
SRC_URI += "http://ftp.vim.org/pub/vim/patches/7.2/7.2.101-200.gz;name=p101-200;apply=yes;patchdir=..;pnum=0"
SRC_URI += "http://ftp.vim.org/pub/vim/patches/7.2/7.2.201-300.gz;name=p201-300;apply=yes;patchdir=..;pnum=0"
SRC_URI += "http://ftp.vim.org/pub/vim/patches/7.2/7.2.301-400.gz;name=p301-400;apply=yes;patchdir=..;pnum=0"
SRC_URI += "file://401-446.diff;patchdir=..;pnum=0"

SRC_URI[vim72.md5sum] = "f0901284b338e448bfd79ccca0041254"
SRC_URI[vim72.sha256sum] = "914db0f2205ebd6f02878295ec2506036ea7500399db112c61a01491cd9a1d86"
SRC_URI[vim72-lang.md5sum] = "d8884786979e0e520c112faf2e176f05"
SRC_URI[vim72-lang.sha256sum] = "11607f539a4518b550bf1606b7d3a6f36c1ffdf566c058e7d94bced78034cd5b"
SRC_URI[vim72-extra.md5sum] = "35e04482f07c57221c9a751aaa3b8dac"
SRC_URI[vim72-extra.sha256sum] = "20894ac79672160bfc4f1d2f9f9775b34d944762d655307a91ca96d358faa04d"

SRC_URI[p001-100.md5sum] = "ba91b19374cee90f71b8f4ab1d92dc0f"
SRC_URI[p001-100.sha256sum] = "519f4fea460e4f7a737ea8006c0dc1684982f8372d1581fb963a5d58f8007f67"
SRC_URI[p101-200.md5sum] = "b485233d360041d043c56cd99057dbff"
SRC_URI[p101-200.sha256sum] = "0a6e25e454706377f8a6babe4da99c6eab7e71a63d28ad9b24aa5c170522bac3"
SRC_URI[p201-300.md5sum] = "069fb537772a8e4a74119d8a6a7e61f3"
SRC_URI[p201-300.sha256sum] = "a11bad3a4e167501c62f0212d3b8935a73a1ae378c5d6ed73a477a71f57baffa"
SRC_URI[p301-400.md5sum] = "137b5821ff4a2266796d14d867be5f9f"
SRC_URI[p301-400.sha256sum] = "41f022ec829786a008685c0b00acf8be09525755a94a06236a4b879b1f84b5f4"

SRC_URI += "file://configure.in_remove_CC_quotes.patch;patchdir=.."
