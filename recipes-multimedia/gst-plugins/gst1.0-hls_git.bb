require gst-hls_git.inc

PR = "r2"


SRCREV = "1955260f4d92d80035eb45de64f371d9b38bf1d1"
PV = "1.0+git${SRCPV}"

DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base libhls"

FILES_${PN} += "${libdir}/gstreamer-1.0/*.so"
FILES_${PN}-dbg += "${libdir}/gstreamer-1.0/.debug"
FILES_${PN}-dev += "${libdir}/gstreamer-1.0/*.la ${libdir}/gstreamer-1.0/*.a"

EXTRA_OECONF += "--with-gstreamer-api=1.0"
