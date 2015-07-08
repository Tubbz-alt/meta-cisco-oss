DESCRIPTION = "HLS library"
HOMEPAGE = "http://wwwin-eng.cisco.com/cgi-bin/edcs/edcs_info?2918509"
SECTION = "libs"
LICENSE = "CLOSED"
PR = "r1"
AUTHOR = "Cisco Systems"

#inherit ciscobyos

SRC_URI = " \
    git://spvtg-git1.cisco.com/data/git/SPVTG/CSE/eRDK/ciscohls.git;user=snobym;protocol=ssh;branch=master \
"

SRCREV = "1955260f4d92d80035eb45de64f371d9b38bf1d1"
PV = "1.0+git${SRCPV}"
S = "${WORKDIR}/git/libhls"

DEPENDS = "curl"

EXTRA_OECONF = "--enable-syslog"

inherit autotools
