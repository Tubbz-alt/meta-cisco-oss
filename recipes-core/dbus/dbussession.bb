DESCRIPTION = "D-Bus Session start up script"
LICENSE = "CLOSED"
PR = "r0"
AUTHOR = "Cisco Systems"

DEPENDS += "dbus glib-2.0"

inherit update-rc.d

# start up d-bus session daemon, see /etc/init.d/dbus-2 for detail
INITSCRIPT_NAME = "dbus-2"
INITSCRIPT_PARAMS = "start 02 5 3 2 . stop 20 0 1 6 ."

SRC_URI += "file://dbus-2"

FILES_${PN} += " ${sysconfdir}/init.d/dbus-2"

do_install() {
    install -d -m 0755 ${D}${sysconfdir}/init.d/
    install -m 0755 ${WORKDIR}/dbus-2 ${D}${sysconfdir}/init.d/
}
