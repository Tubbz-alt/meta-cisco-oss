DESCRIPTION = "Asynchronous Name Resolver"
HOMEPAGE = "http://c-ares.haxx.se/"
AUTHOR = "Daniel Stenberg, et al."

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README;md5=c0b3d98f4f6401cfff7ef5f7c692b7fc"

SECTION = "net"

PR = "r0"

SRC_URI = "http://c-ares.haxx.se/download/${BPN}-${PV}.tar.gz"

SRC_URI[md5sum] = "1196067641411a75d3cbebe074fd36d8"
SRC_URI[sha256sum] = "3d701674615d1158e56a59aaede7891f2dde3da0f46a6d3c684e0ae70f52d3db"

S = "${WORKDIR}/${BPN}-${PV}"

inherit autotools

