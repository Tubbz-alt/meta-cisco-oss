SECTION = "uriparser"
DESCRIPTION = "RFC 3986 compliant URI parsing library"
LICENSE = "BSD"
AUTHOR = "Sebastian Pipping & Weijia Song"
LIC_FILES_CHKSUM = "file://COPYING;md5=72b0f9c74ae96eeab8cf1bf3efe08da2"

PR = "r2"

SRC_URI := "http://sourceforge.net/projects/uriparser/files/Sources/${PV}/uriparser-${PV}.tar.bz2"


inherit autotools
EXTRA_OECONF = "--disable-test --disable-doc"

SRC_URI[md5sum] = "77601f52ab91c0e100fc5d783d9c1ee5"
SRC_URI[sha256sum] = "1dd9f9779d8f17822bd7d68ba042fd67779b6e4ccf162bd3c9d0ff19a8ba9bf7" 
