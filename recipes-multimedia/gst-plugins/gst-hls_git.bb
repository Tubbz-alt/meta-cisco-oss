require gst-hls_git.inc

PR = "r18"

#inherit ciscobyos

SRCREV = "da6e74cac1e606aa450ef3fd0c63dc8642d6d44e"
PV = "1.0+git${SRCPV}"

DEPENDS = "gstreamer gst-plugins-base libhls"

FILES_${PN} += "${libdir}/gstreamer-0.10/*.so"
FILES_${PN}-dbg += "${libdir}/gstreamer-0.10/.debug"
FILES_${PN}-dev += "${libdir}/gstreamer-0.10/*.la ${libdir}/gstreamer-0.10/*.a"
