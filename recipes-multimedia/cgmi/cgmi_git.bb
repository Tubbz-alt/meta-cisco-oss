require cgmi.inc

PR = "r5"

##inherit update-rc.d


##SRC_URI += "file://init-1.0"

##INITSCRIPT_NAME = "cgmi-daemon-1.0"
##INITSCRIPT_PARAMS = "defaults 96"

##PV = "1.0+git${SRCPV}"
SRCREV = "459be2711247434547d62b13a46cfe8ccb2e8581"

EXTRA_OECONF += "--enable-cli-noipc=yes"
EXTRA_OECONF += "--with-gstreamer-api=1.0"
EXTRA_OECONF += "--enable-rdk-emulator"
EXTRA_OECONF += "--enable-dlna-autodetect"
EXTRA_OECONF += "--enable-bypass-monitoring"

##install -m 0755 ${WORKDIR}/init-1.0 ${D}${sysconfdir}/init.d/cgmi-daemon-1.0

DEPENDS = "gstreamer1.0 gstreamer1.0-plugins-base curl"
do_install_append() {
   install -d ${D}${sysconfdir}/init.d
   cd ${D}${bindir}; ln -sf cgmi_cli-1.0 cgmi_cli
}

