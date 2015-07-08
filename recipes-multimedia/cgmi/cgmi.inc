DESCRIPTION = "Cisco Gstreamer Media Interface "
HOMEPAGE = "https://github.com/cisco/cgmi"
SECTION = "console/utils"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=286c772587353199989bea3d935e1718"    
AUTHOR = "Cisco Systems"
PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit autotools pkgconfig

SRC_URI = "git://github.com/cisco/cgmi.git"

S = "${WORKDIR}/git/hplayer"

