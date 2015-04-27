DESCRIPTION = "HLS library"
HOMEPAGE = "http://wwwin-eng.cisco.com/cgi-bin/edcs/edcs_info?2918509"
SECTION = "libs"
LICENSE = "CLOSED"
PR = "r16"
AUTHOR = "Cisco Systems"

#inherit ciscobyos

SRC_URI = " \
    git://spvtg-git1.cisco.com/data/git/SPVTG/CSE/eRDK/ciscohls.git;user=snobym;protocol=ssh;branch=master \
"

SRCREV = "1f19d45c52e2343eb0910de04a61ff28459bd81a"
PV = "1.0+git${SRCPV}"
S = "${WORKDIR}/git/libhls"

DEPENDS = "curl"

EXTRA_OECONF = "--enable-syslog"

inherit autotools
