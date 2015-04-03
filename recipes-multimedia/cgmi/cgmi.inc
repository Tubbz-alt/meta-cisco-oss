DESCRIPTION = "Cisco Gstreamer Media Interface "
HOMEPAGE = ""
SECTION = "console/utils"
LICENSE = "CLOSED"
AUTHOR = "Cisco Systems"
PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit autotools pkgconfig

SRC_URI = " \
    git://spvtg-git1.cisco.com/data/git/SPVTG/CSE/eRDK/cgmi.git;user=${CECUSERID};protocol=ssh;branch=master \
 "

S = "${WORKDIR}/git/hplayer"

