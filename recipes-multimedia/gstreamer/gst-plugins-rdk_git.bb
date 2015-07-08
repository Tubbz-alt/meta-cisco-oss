#
# ============================================================================
# COMCAST C O N F I D E N T I A L AND PROPRIETARY
# ============================================================================
# This file and its contents are the intellectual property of Comcast.  It may
# not be used, copied, distributed or otherwise  disclosed in whole or in part
# without the express written permission of Comcast.
# ============================================================================
# Copyright (c) 2014 Comcast. All rights reserved.
# ============================================================================
#
SUMMARY = "RDK Gstreamer plugins"
DESCRIPTION = "RDK gst-plugins. These are the plugins encoding and \
decoding gstreamer elements. Theere are plugins available for dtcp and \
aes encoding/decoding. DTCP is used for Data exchange between the home \
networking elements. AES is used for interworking with the recorded \
data or the local tsb."

SECTION = "console/utils"

LICENSE = "CLOSED"
PV = "${RDK_RELEASE}+git${SRCPV}"

PV = "${RDK_RELEASE}+git${SRCPV}"
SRC_URI = "git://${RDK_GIT}/rdk/components/generic/gst-plugins-rdk/generic;protocol=${RDK_GIT_PROTOCOL};branch=master"

S = "${WORKDIR}/git"

FILES_${PN} += "${libdir}/gstreamer-*/*.so"
FILES_${PN}-dev += "${libdir}/gstreamer-*/*.la"
FILES_${PN}-dbg += "${libdir}/gstreamer-*/.debug/*"
FILES_${PN}-staticdev += "${libdir}/gstreamer-*/*.a "

DEPENDS = "curl rmfgeneric virtual/dvrmgr-hal libtinyxml"
DEPENDS += " ${@base_contains('DISTRO_FEATURES', 'gstreamer1', 'gstreamer1.0', 'gstreamer', d)}"

ENABLE_GST1 = "--enable-gstreamer1=${@base_contains('DISTRO_FEATURES', 'gstreamer1', 'yes', 'no', d)}"
EXTRA_OECONF = "${ENABLE_GST1}"

inherit autotools pkgconfig

# only enable DTCPdec by default, as it's used in all configs.
# others can be enabled when required
PACKAGECONFIG ??= "dtcpdec dtcpenc httpsink aesencrypt aesdecrypt dvrsink dvrsrc httpsrc rbifilter tee"
PACKAGECONFIG[dtcpdec] = "--enable-dtcpdec,,virtual/dtcpmgr"
PACKAGECONFIG[dtcpenc] = "--enable-dtcpenc,,virtual/dtcpmgr"
PACKAGECONFIG[httpsink] = "--enable-httpsink,,"
PACKAGECONFIG[aesencrypt] = "--enable-aesencrypt,,"
PACKAGECONFIG[aesdecrypt] = "--enable-aesdecrypt,,"
PACKAGECONFIG[dvrsink] = "--enable-dvrsink,,"
PACKAGECONFIG[dvrsrc] = "--enable-dvrsrc,,"
PACKAGECONFIG[httpsrc] = "--enable-httpsrc,,"
PACKAGECONFIG[rbifilter] = "--enable-rbifilter,,"
PACKAGECONFIG[tee] = "--enable-tee,,"
