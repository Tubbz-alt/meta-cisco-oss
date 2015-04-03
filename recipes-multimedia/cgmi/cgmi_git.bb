require cgmi.inc

PR = "r1"

inherit update-rc.d


SRC_URI += "file://init-1.0"

INITSCRIPT_NAME = "cgmi-daemon-1.0"
INITSCRIPT_PARAMS = "defaults 96"

PV = "1.0+git${SRCPV}"
SRCREV = "b4a771cc66c9a527b31b0886f6a6d4c7850d4b5a"

EXTRA_OECONF += "--enable-cli-noipc=yes"
EXTRA_OECONF += "--with-gstreamer-api=1.0"


DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base curl"
do_install_append() {
   install -d ${D}${sysconfdir}/init.d
   install -m 0755 ${WORKDIR}/init-1.0 ${D}${sysconfdir}/init.d/cgmi-daemon-1.0
   cd ${D}${bindir}; ln -sf cgmi_cli-1.0 cgmi_cli
}

