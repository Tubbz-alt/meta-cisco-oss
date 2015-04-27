DESCRIPTION = "HLS gstreamer plugin"
#HOMEPAGE = ""
SECTION = "libs"
LICENSE = "CLOSED"
AUTHOR = "Cisco Systems"

SRC_URI = " \
    git://spvtg-git1.cisco.com/data/git/SPVTG/CSE/eRDK/ciscohls.git;user=snoby;protocol=ssh;branch=master \
"

S = "${WORKDIR}/git/gsthls"

inherit autotools
