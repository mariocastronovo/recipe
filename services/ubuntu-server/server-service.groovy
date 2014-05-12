service {
	name "test"
	icon "ubuntu.png"
	type "WEB_SERVER"
	numInstances 1

	compute {
		template "SMALL_LINUX"
	}
  lifecycle {
    }
}