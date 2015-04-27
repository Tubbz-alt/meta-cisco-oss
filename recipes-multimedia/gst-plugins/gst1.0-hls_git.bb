require gst-hls_git.inc

PR = "r1"

#inherit ciscobyos

SRCREV = "1f19d45c52e2343eb0910de04a61ff28459bd81a"
PV = "1.0+git${SRCPV}"

DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base libhls"

FILES_${PN} += "${libdir}/gstreamer-1.0/*.so"
FILES_${PN}-dbg += "${libdir}/gstreamer-1.0/.debug"
FILES_${PN}-dev += "${libdir}/gstreamer-1.0/*.la ${libdir}/gstreamer-1.0/*.a"

EXTRA_OECONF += "--with-gstreamer-api=1.0"
