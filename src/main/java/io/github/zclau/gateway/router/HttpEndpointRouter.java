package io.github.zclau.gateway.router;

import java.util.List;

public interface HttpEndpointRouter {

    String route(List<String> endpoints);
}
