DESCRIPTION = "Cisco Gstreamer Media Interface "
HOMEPAGE = ""
SECTION = "console/utils"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=286c772587353199989bea3d935e1718"    
AUTHOR = "Cisco Systems"
PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit autotools pkgconfig

SRC_URI = " \
    git://spvtg-git1.cisco.com/data/git/SPVTG/CSE/eRDK/cgmi.git;user=snobym;protocol=ssh;branch=user/snobym/pc_test \
 "

S = "${WORKDIR}/git/hplayer"

